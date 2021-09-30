import { browser, by, element, promise, ElementFinder } from 'protractor';
export class Main{
    navigateToHome():promise.Promise<any> {
    	return browser.get('/');
  	}
	/* Mock data for creating a new Player and editing existing Player */

	getMockPlayer(): any {
		let player: any = { name: "SALAH",age: "28",club: "LIVERPOOL",country:'EGYPT'}
  		return player;
	}

	getEditedMockPlayer(): any {
		let player: any = {"name":'RONALDO','age':'36','club':'JUVENTUS','country':'PORTUGAL'}
		return player;
	}
	
	/* Methods shared by addPlayer and updatePlayer */

	getInputName():ElementFinder {
		return element(by.name("name"));
		// name("name")
	}

	getInputAge(): ElementFinder {
		return element(by.name("age"));
	}

	getInputClub(): ElementFinder {
		return element(by.name("club"));

	}
    getInputCountry(): ElementFinder{
        return element(by.name("country"));

    }
}