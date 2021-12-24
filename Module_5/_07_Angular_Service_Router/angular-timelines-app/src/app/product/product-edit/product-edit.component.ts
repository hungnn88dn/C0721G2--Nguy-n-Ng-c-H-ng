import {Component, OnInit} from '@angular/core';
import {Product} from '../../model/product';
import {ActivatedRoute} from '@angular/router';
import {DictionaryService} from '../../service/dictionary.service';
import {ProductService} from '../../service/product.service';
import {FormControl, FormGroup} from '@angular/forms';

@Component({
  selector: 'app-product-edit',
  templateUrl: './product-edit.component.html',
  styleUrls: ['./product-edit.component.css']
})
export class ProductEditComponent implements OnInit {
  editProduct: Product | undefined;

  productForm: FormGroup = new FormGroup({
    id: new FormControl(),
    name: new FormControl(),
    price: new FormControl(),
    description: new FormControl(),
  });

  constructor(private activatedRoute: ActivatedRoute, private productService: ProductService) {
  }

  ngOnInit(): void {
   let indexEdit = this.activatedRoute.snapshot.params['index'];
    this.editProduct = this.productService.findProductById(indexEdit);
  }

  submit(productForm: FormGroup) {
    let indexEdit = this.activatedRoute.snapshot.params['index'];
    this.editProduct = productForm.value;
    console.log(this.editProduct.id);
    this.productService.products[indexEdit] = this.editProduct;
  }
}
