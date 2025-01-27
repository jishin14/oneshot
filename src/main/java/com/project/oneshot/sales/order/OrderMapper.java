package com.project.oneshot.sales.order;

import com.project.oneshot.command.*;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    // ----- 판매내역 ----- //
    public int orderHeader(OrderVO vo); //판매등록
    public int orderItem(OrderVO vo); //판매상세등록

    public List<OrderVO> getList(OrderCriteria cri); //판매내역조회
    public List<OrderItemVO> getItems(int orderHeaderNo);


    public List<OrderItemVO> getOrderItemsByOrderHeaderNo(int orderHeaderNo);
    public int getOrderItemCount(int orderHeaderNo);

    public List<EmployeeVO> getEmployeeList(); //판매담당자 조회
    public EmployeeVO getEmployeeContent(int employeeNo); //사원 상세정보 조회

    public List<ClientVO> getClientList(); //고객사조회
    public ClientVO getClientContent(int clientNo); //고객사 상세정보 조회
    public List<ContractVO> getProductList(int clientNo); //상품조회
    public int getProductPrice(@Param("clientNo") int clientNo, @Param("productNo") int productNo); //계약가격조회

    public int getTotalCount(OrderCriteria cri);

    public void updateDeliveryStatus(List<Integer> orderHeaderNos); //업데이트(상태)
    public void updateItem(OrderItemVO vo); //업데이트(상품정보)

    public void changeProductStatus();


    int getInventoryQuantity(int productNo); //재고 조회

    List<Map<String, Object>> getQuarterlyOrderAmount();
}
