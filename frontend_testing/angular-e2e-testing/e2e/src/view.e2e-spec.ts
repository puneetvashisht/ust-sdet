import { browser, protractor } from 'protractor';
import { View } from './page-objects/view.po';

describe ('View players page', ()=>{
    const view: View = new View;
    
    // executed before each spec
    beforeEach( async ()=>{
       await view.navigateToHome();
    });

   it('Should display Players management system as a title' ,async ()=>{
       expect (await view.getViewContainerHeading()).toEqual("Players management system");
   });
    
   it ('Should have a table ', async () => {
       expect(await view.getTable()).toBeTruthy();
   });

   it('Should have the app add player tag', async () => {
       expect(await view.getAddPlayerTag()).toBeTruthy();
   });

   it('Should have a table with headers ', async () => {
       expect (await view.getTableHeader()).toContain('NAME AGE CLUB COUNTRY');
   });
   it('Should have a delete button', async () => {
      expect (await view.getDeleteButton().isPresent()).toBeTruthy('Delete button should be present'); 
   });

   it('Delete should work', async () => {
       await view.clickDeleteButton();
       expect(view.isDeleteModalPresent()).toBeTruthy('Modal delete should appear');
       const rowToBeDeleted = view.getLastRowData();
       await view.clickConfirmDeleteButton();
       expect(view.getLastRowData()).not.toEqual(rowToBeDeleted);
       expect(view.isDeleteModalPresent()).toBeFalsy('Delete modal should be gone');

   })
     
    
})