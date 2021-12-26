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
  id: number;
  indexEdit: number;

  constructor(private activatedRoute: ActivatedRoute, private productService: ProductService) {
  }

  ngOnInit(): void {
   let indexEdit = this.activatedRoute.snapshot.params['index'];
    this.editProduct = this.productService.findProductById(indexEdit);
  }


  submit(productForm: FormGroup) {
      this.editProduct = productForm.value;
    this.productService.updateProduct(this.editProduct.id, this.editProduct);
  }
}
