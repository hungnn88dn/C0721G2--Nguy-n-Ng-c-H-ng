
import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {TimelinesComponent} from './timelines/timelines.component';
import {YoutubePlaylistComponent} from './youtube-playlist/youtube-playlist.component';
import {YoutubePlayerComponent} from './youtube-player/youtube-player.component';
import {ProductListComponent} from './product/product-list/product-list.component';
import {ProductCreateComponent} from './product/product-create/product-create.component';
import {DictionaryComponent} from './dictionary/dictionary.component';
import {DictionaryDetailComponent} from './dictionary-detail/dictionary-detail.component';
import {ProductEditComponent} from './product/product-edit/product-edit.component';
import {ProductDeleteComponent} from './product/product-delete/product-delete.component';

const routes: Routes = [
  {
    path: 'timelines',
    component: TimelinesComponent

  },
  {
    path: 'youtube',
    component: YoutubePlaylistComponent,
    children: [{
      path: ':id',
      component: YoutubePlayerComponent
    }]
  },
  {
    path: 'product/list',
    component: ProductListComponent
  },
  {
    path: 'product/create',
    component: ProductCreateComponent
  },
  {
    path: 'dictionary/list',
    component: DictionaryComponent
  },
  {
    path: 'dictionary/detail/:index',
    component: DictionaryDetailComponent
  },
  {
    path: 'product/edit/:index',
    component: ProductEditComponent
  },
  {
    path: 'product/delete/:index',
    component: ProductDeleteComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
