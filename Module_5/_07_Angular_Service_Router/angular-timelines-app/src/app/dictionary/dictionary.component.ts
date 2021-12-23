import { Component, OnInit } from '@angular/core';
import {Dictionary} from '../model/dictionary';
import {DictionaryService} from '../service/dictionary.service';
import {Route} from '@angular/router';

@Component({
  selector: 'app-dictionary',
  templateUrl: './dictionary.component.html',
  styleUrls: ['./dictionary.component.css']
})
export class DictionaryComponent implements OnInit {

  dictionarylist: Dictionary[] = [];
  constructor(private dictionaryService: DictionaryService) {}

  ngOnInit(): void {
    this.getAll();
  }
  getAll() {
    this.dictionarylist = this.dictionaryService.dictionarylist;
  }


}
