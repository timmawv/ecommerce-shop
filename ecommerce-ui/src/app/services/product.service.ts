import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../common/product';
import { ProductCategory } from '../common/product-category';

@Injectable({
  providedIn: 'root'
})
export class ProductService {

  private baseUrl = "http://localhost:8080/api/v1";

  constructor(private httpClient: HttpClient) {}

  getProductList(theCategoryId: number): Observable<Product[]> {
    const url = `${this.baseUrl}/categories/${theCategoryId}`;

    return this.httpClient.get<Product[]>(url);
  }

  getProductCategories() {
    const url = `${this.baseUrl}/categories`;

    return this.httpClient.get<ProductCategory[]>(url);
  }
}