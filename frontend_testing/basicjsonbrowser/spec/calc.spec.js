import {add, mul} from '../src/calc'

describe("Calc suite", function() {

  // beforeAll(function() {
  //   console.log('Before all test cases.. but only once')
  // })

  // beforeEach(function() {
  //   console.log('Before each test case');
  // });

    // @Test
    xit("contains spec with an expectation", function() {
        //assert
      expect(true).toBe(true);
      fail("Callback has been called");
    });

    it("sum of 2 & 3 to be 5", ()=>{
      let result = add(2,3);
      console.log(result);
      expect(result).toBe(5);
    })

    it("mul of 2 & 3 to be 6", ()=>{
      let result = mul(3,2);
      console.log(result);
      expect(result).toBe(6);
      expect(result).toBeGreaterThan(3);
    })


});