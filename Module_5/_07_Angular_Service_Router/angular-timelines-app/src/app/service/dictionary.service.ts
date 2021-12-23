
import {Injectable} from '@angular/core';
import {Dictionary} from '../model/dictionary';


@Injectable({
  providedIn: 'root'
})
export class DictionaryService {
  dictionarylist: Dictionary[] = [
    {
      id: 1,
      name: 'Hello',
      description: 'Xin Chao'
    },
    {
      id: 2,
      name: 'Bye',
      description: 'Tam Biet'
    },
    {
      id: 3,
      name: 'Monday',
      description: 'Thu 2'
    },
    {
      id: 4,
      name: 'Sunday',
      description: 'Chu Nhat'
    }
  ];

  constructor() {
  }

  findDictionaryById(id: string) {
    return this.dictionarylist[id];
  }
}
