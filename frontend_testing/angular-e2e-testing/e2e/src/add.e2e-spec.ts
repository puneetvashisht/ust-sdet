import { Add } from "./page-objects/add.po";
import { View } from "./page-objects/view.po"
import { browser, protractor } from 'protractor';

describe('Add new player page', ()=>{
    const viewPage: View = new View();
    const addPage: Add = new Add();
    
    beforeEach(async ()=>{
        await addPage.navigateToHome();
    });
    it('should have an add player button and a modal with close button ', async () => {
        expect( await addPage.isCreateButtonPresent()).toBeTruthy('Button should exist');

        expect( await addPage.isCreateAddModalPresent()).toBeFalsy('The modal should not appear yet');

       /* click on the addPlayer button to test the modal */

        await addPage.clickCreateButton();

        expect(await addPage.isCreateAddModalPresent()).toBeTruthy('The modal should appear now');
        expect(await addPage.getCloseButton().isPresent()).toBeTruthy('close button should exist');

    });

    // it('Should have an empty form, accept inputs, save a new player and close the modal', async () => {
    //    await addPage.clickCreateButton();
    //    const emptyValues = ["","","",""];
    //     /* modal form should be empty at first */        
    //    expect (await addPage.getInputValues()).toEqual(emptyValues);
    //    /* fill the form */
    //    const inputValues = await addPage.addNewPlayer();
    //    /* form should be filled with new values */
    // //    expect (await addPage.getInputValues()).toEqual(inputValues);
    //    await addPage.clickSaveButton();
    //    expect(addPage.isCreateAddModalPresent()).toBeFalsy('Modal should be closed');
    //    /* fetch the last row and make sure it has the right values */
    //    expect(await viewPage.getLastRowData()).toContain('LIVERPOOL');

    // });

    // it('close button should work', async ()=>{
    //  await addPage.clickCreateButton();
    // /* expect(await addPage.isCreateAddModalPresent()).toBeTruthy();*/
    //  await addPage.clickCloseButton();
    //  expect(await addPage.isCreateAddModalPresent()).toBeFalsy();
    // });
});