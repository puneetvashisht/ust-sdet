import { promise, by, ElementFinder, ElementArrayFinder, element } from "protractor";
import { Main } from "./main.po";

export class View extends Main {
    
    getViewContainer():ElementFinder {
		return element(by.css('.container'));
	}
    getViewContainerHeading(): promise.Promise<string> {
		return this.getViewContainer().element(by.css("h2")).getText();
	}

	/*Table Data */

	getTable():ElementFinder {
		return element(by.css('table'));

	}

	getTableHeader(): promise.Promise<string> {
		return this.getViewContainer().all(by.tagName('tr')).get(0).getText();
	}

	getTableRow(): ElementArrayFinder {
		return this.getViewContainer().all(by.tagName('tr'));
	}

	
	getFirstRowData(): promise.Promise<string> {
		return this.getTableRow().get(1).getText();
	}

	getLastRowData(): promise.Promise<string> {
		return this.getTableRow().last().getText();
	}


	getAddPlayerTag(): ElementFinder {
		return this.getViewContainer().element(by.tagName('app-add-player'));
	}

	isAddPlayerTagPresent(): promise.Promise<boolean> {
		return this.getAddPlayerTag().isPresent();
	}
    getDeleteButton(): ElementFinder {
        return this.getViewContainer().element(by.buttonText("Delete"));
    }
    clickDeleteButton(): promise.Promise<void> {
		return this.getDeleteButton().click();
	}

    getDeleteModal(): ElementFinder {
		return this.getViewContainer().element(by.id("exampleModal"));
	}

	isDeleteModalPresent() : promise.Promise<boolean> {
		return this.getDeleteModal().isPresent();
	}
    getConfirmDeleteButton(): ElementFinder {
        return this.getViewContainer().element(by.buttonText("Confirm"));
    }
    clickConfirmDeleteButton(): promise.Promise<void> {
		return this.getConfirmDeleteButton().click();
	}
}