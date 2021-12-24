import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from '@angular/router';
import {ProductService} from '../../service/product.service';
import {Product} from '../../model/product';

@Component({
  selector: 'app-product-delete',
  templateUrl: './product-delete.component.html',
  styleUrls: ['./product-delete.component.css']
})
export class ProductDeleteComponent implements OnInit {
  deleteProduct: Product | undefined;
  constructor(private activatedRoute: ActivatedRoute, private productService: ProductService) {
  }

  ngOnInit(): void {
    let indexDelete = this.activatedRoute.snapshot.params['index'];
    this.deleteProduct = this.productService.findProductById(indexDelete);
  }

  submit() {
    let indexDelete = this.activatedRoute.snapshot.params['index'];
    this.productService.deleteProductById(indexDelete);

  }
}
