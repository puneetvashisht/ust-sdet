import { ElementFinder, element, by, promise } from "protractor";
import { Main } from "./main.po";

export class Add extends Main{
    getAddPlayer():ElementFinder {
		return element(by.tagName('app-add-player'));
	}
	
	/* Create Paste button */
	getCreateButton(): ElementFinder {
		return this.getAddPlayer().element(by.buttonText("Add player"));
	}

	isCreateButtonPresent() : promise.Promise<boolean> {
		return this.getCreateButton().isPresent();
	}

	clickCreateButton(): promise.Promise<void> {
		return this.getCreateButton().click();
	}


	getCreateAddModal(): ElementFinder {
		return this.getAddPlayer().element(by.id("exampleModalCenterAdd"));
	}

	isCreateAddModalPresent() : promise.Promise<boolean> {
		return this.getCreateAddModal().isPresent();
	}

	/*Save button */
	getSaveButton(): ElementFinder {
		return this.getAddPlayer().element(by.buttonText("Add"));
	}
	
	clickSaveButton():promise.Promise<void> {
		return this.getSaveButton().click();
	}

	/*Close button */

	getCloseButton(): ElementFinder {
		return this.getAddPlayer().element(by.buttonText("Cancel"));
	}

	clickCloseButton():promise.Promise<void> {
		return this.getCloseButton().click();
	}
	

	/* Get Input values from the Modal window */
	getInputValues():Promise<String[]> {
		return Promise.all([
        this.getInputName().getAttribute('value')
        ,this.getInputAge().getAttribute('value')
        ,this.getInputClub().getAttribute('value'),
        this.getInputCountry().getAttribute('value')])
		.then( (values) => {    
            console.log(values);
                    
			return values;
		});
		
	}
    


	addNewPlayer():any {
		let newPlayer: any = this.getMockPlayer();
     
		// this.getInputName().sendKeys(newPlayer.name);
		this.getInputAge().sendKeys(newPlayer.age);
        this.getInputClub().sendKeys(newPlayer.club);
        this.getInputCountry().sendKeys(newPlayer.country);


  		return Object.keys(newPlayer).map(key => newPlayer[key]);

	}

}