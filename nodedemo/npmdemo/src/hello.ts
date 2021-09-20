class Employee{
    id: number;
    name: string;
    salary: number;

    constructor(id: number, name: string, salary: number){
        this.id = id;
        this.name=  name;
        this.salary = salary;
    }

    incrementSalary(incrementBy: number): void{
        this.salary += incrementBy
    }
}

let e1 = new Employee(12, "Ravi", 34343.34);
console.log(e1);
e1.incrementSalary(3000);
console.log(e1);
