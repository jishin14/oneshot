package com.project.oneshot.app.product;

import com.project.oneshot.command.CategoryVO;
import com.project.oneshot.command.ProductVO;
import com.project.oneshot.command.SupplierVO;
import com.project.oneshot.inventory.product.ProductCriteria;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

public interface AppProductService {

    List<ProductVO> getProductList();

    List<SupplierVO> getSupplierList();

    SupplierVO getSupplierContent(int supplierNo);

    List<CategoryVO> getCategoryList();

    void postProduct(ProductVO vo, MultipartFile file);

    ProductVO getProductContent(int productNo);

    void putProduct(ProductVO vo, MultipartFile file);

    int checkProductName(String productName);
}