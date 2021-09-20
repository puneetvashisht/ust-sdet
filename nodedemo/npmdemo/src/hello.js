var Employee = /** @class */ (function () {
    function Employee(id, name, salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }
    Employee.prototype.incrementSalary = function (incrementBy) {
        this.salary += incrementBy;
    };
    return Employee;
}());
var e1 = new Employee(12, "Ravi", 34343.34);
console.log(e1);
e1.incrementSalary(3000);
console.log(e1);
