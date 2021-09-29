import { UserService } from "./user.service";

describe('Userservice without Angular testing support', () => {
    let userService: UserService;

    it('#getValue should return real value from the real service', () => {
        userService = new UserService();
        expect(userService.isLoggedIn).toBe(false);
        expect(userService.user.name).toBe('Test User');
      });

})