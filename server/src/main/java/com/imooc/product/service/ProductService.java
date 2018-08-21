package com.imooc.product.service;

import com.imooc.product.DecreaseStockInput;
import com.imooc.product.ProductInfoOutput;
import com.imooc.product.dataobject.ProductInfo;

import java.util.List;

public interface ProductService {

    List<ProductInfo> findUpAll();

    List<ProductInfoOutput> findList(List<String> productIdList);

    void decreaseStock(List<DecreaseStockInput> cartDTOList);
}
