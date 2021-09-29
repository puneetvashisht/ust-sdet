import { SearchPipe } from './search.pipe';
import { Workout } from './Workout';

describe('SearchPipe', () => {
  it('create an instance', () => {
    const pipe = new SearchPipe();
    expect(pipe).toBeTruthy();
  });


  it('create an instance', () => {
    const pipe = new SearchPipe();

    let workouts: Array<Workout> =  [
      {
        "id": 1,
        "title": "Swimming",
        "desc": "overall fitness",
        "cbpm": 23,
        "startTime": "2021-09-27T05:10:41.156Z",
        "endTime": "2021-09-27T05:12:59.919Z"
      },
      {
        "id": 2,
        "title": "Running",
        "desc": "overall fitness",
        "cbpm": 18,
        "startTime": "2021-09-27T05:13:37.372Z",
        "endTime": "2021-09-27T10:09:39.088Z"
      },
      {
        "title": "Backstroke Swimming",
        "desc": "Really good ",
        "cbpm": 23,
        "id": 3,
        "startTime": "2021-09-27T10:11:21.224Z",
        "endTime": "2021-09-27T10:12:45.664Z"
      },
      {
        "title": "Frontfly Swimming",
        "desc": "Really good ",
        "cbpm": 22,
        "id": 4,
        "startTime": "2021-09-27T10:12:54.696Z",
        "endTime": "2021-09-27T10:14:37.716Z"
      }
    ]

    let search = "Swimming"

    let transfomedWorkouts: Array<Workout> = pipe.transform(workouts, search);
    expect(transfomedWorkouts.length).toBe(3);

    search = "Running"
    transfomedWorkouts = pipe.transform(workouts, search);
    expect(transfomedWorkouts.length).toBe(1);
  });
});
