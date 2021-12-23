import {Component, OnInit} from '@angular/core';
import {ActivatedRoute, ParamMap} from '@angular/router';
import {DictionaryService} from '../service/dictionary.service';
import {Dictionary} from '../model/dictionary';

@Component({
  selector: 'app-dictionary-detail',
  templateUrl: './dictionary-detail.component.html',
  styleUrls: ['./dictionary-detail.component.css']
})
export class DictionaryDetailComponent implements OnInit {

  detail: Dictionary | undefined;

  constructor(private activatedRoute: ActivatedRoute, private dictionaryService: DictionaryService) {
  }

  ngOnInit(): void {
    // this.activatedRoute.paramMap.subscribe((paramMap: ParamMap) => {
    //   const id = paramMap.get('id');
    //   this.detail = this.dictionaryService.findDictionaryById('id');
    //   console.log(this.detail);
    // });
    let indexDic = this.activatedRoute.snapshot.params['index'];
    this.detail = this.dictionaryService.findDictionaryById(indexDic);
    console.log(indexDic);
  }
}
