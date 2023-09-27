<%@ page contentType = "text/html; charset=utf-8" %>
<%@ page import="java.util.ArrayList"%>
<%@ page import="dto.Product"%>
<jsp:useBean id="productDAO" class="dao.ProductRepository" scope="session"/>


<%-- CLASS는 스타일 적용시에 사용 되는 이름, 중첩 가능 --%>   
<%! String greeting = "Welcome"; 
String tagline = "실시간 랭킹"; %>

    <div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				<%=greeting%>
			</h1>
		</div>
	</div>	

        
<%	ArrayList<Product> listOfProducts = productDAO.getAllProducts();  // 리스트에 상품 전체 정보를 얻어온다.%> 	


	<div class="container">
		<div class="row" align="center">
			<%
				for (int i = 0; i < listOfProducts.size(); i++) {
					Product product = listOfProducts.get(i);
			%>
			<div class="col-md-4">
                <div class="card bg-dark text-white">
                    <img src="image/product/<%=product.getProductId()%>.png" class="card-img" alt="...">
                    <div class="card-img-overlay">
                        <h5 class="card-title">그래픽 카드 이미지 샘플</h5>
                        <p class="card-text">출처 : 구글 검색</p>
                    </div>
                </div>
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><%=product.getUnitPrice()%>원
			</div>
			<%
				}
			%>
		</div>
		<hr>
	</div>


<div class="container">
		<div class="text-center">
			<h3>
				<%=tagline%>
			</h3>
		</div>
		<hr>
</div>

<div class="card bg-dark text-black">
    <img src="image/top.jpg" class="card-img" alt="...">
    <div class="card-img-overlay">
        <h5 class="card-title">주신사</h5>
        <p class="card-text">노주희</p>
    </div>
</div>

<div class="list-group">
     <a href="#" class="list-group-item list-group-item-action active" aria-current="true">
        지포스 3060 시리즈
     </a>
     <a href="#" class="list-group-item list-group-item-action">지포스 3070 시리즈</a>
    <a href="#" class="list-group-item list-group-item-action">지포스 3080 시리즈</a>
    <a href="#" class="list-group-item list-group-item-action">지포스 3090 시리즈</a>
    <a href="#" class="list-group-item list-group-item-action">지포스 3100 시리즈</a>
      
</div>