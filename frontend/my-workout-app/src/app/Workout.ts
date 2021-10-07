import { User } from './User';
export class Workout{
    constructor(public id: number, public title: string, public desc: string, public cbpm: number, public startTime: string, public endTime: string, public totalCaloriesBurnt?: number, public users?: User[] ){

    }
}