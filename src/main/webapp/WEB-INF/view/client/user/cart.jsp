<jsp:include page="../layout/header.jsp" />

<div class="shopping-cart">
	<div class="container">
		<div class="row">
			<div class="col-md-12">
				<div class="location">
					<ul>
						<li><a href="index.html" title="go to homepage">Home<span>/</span></a>
						</li>
						<li><strong> Shopping cart</strong></li>
					</ul>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-md-12">
				<div class="table-responsive">
					<table class="table-bordered table table-hover">
						<thead>
							<tr>
								<th class="cart-item-img"></th>
								<th class="cart-product-name">Product Name</th>
								<th class="edit"></th>
								<th class="move-wishlist">Move to Wishlist</th>
								<th class="unit-price">Unit Price</th>
								<th class="quantity">Qty</th>
								<th class="subtotal">Subtotal</th>
								<th class="remove-icon"></th>
							</tr>
						</thead>
						<tbody class="text-center">
							<tr>
								<td class="cart-item-img"><a href="single-product.html">
										<img src="img/cart/3.png" alt="">
								</a></td>
								<td class="cart-product-name"><a href="single-product.html">Cras
										neque metus</a></td>
								<td class="edit"><a href="#">Edit</a></td>
								<td class="move-wishlist"><a href="#">Move</a></td>
								<td class="unit-price"><span>$174.00</span></td>
								<td class="quantity"><span>1</span></td>
								<td class="subtotal"><span>$174.00</span></td>
								<td class="remove-icon"><a href="#"> <img
										src="img/cart/btn_remove.png" alt="">
								</a></td>
							</tr>
							<tr>
								<td class="cart-item-img"><a href="single-product.html">
										<img src="img/cart/4.png" alt="">
								</a></td>
								<td class="cart-product-name"><a href="single-product.html">Cras
										neque metus</a></td>
								<td class="edit"><a href="#">Edit</a></td>
								<td class="move-wishlist"><a href="#">Move</a></td>
								<td class="unit-price"><span>$174.00</span></td>
								<td class="quantity"><span>1</span></td>
								<td class="subtotal"><span>$174.00</span></td>
								<td class="remove-icon"><a href="#"> <img
										src="img/cart/btn_remove.png" alt="">
								</a></td>
							</tr>
							<tr>
								<td class="cart-item-img"><a href="single-product.html">
										<img src="img/cart/5.png" alt="">
								</a></td>
								<td class="cart-product-name"><a href="single-product.html">Cras
										neque metus</a></td>
								<td class="edit"><a href="#">Edit</a></td>
								<td class="move-wishlist"><a href="#">Move</a></td>
								<td class="unit-price"><span>$275.00</span></td>
								<td class="quantity"><span>2</span></td>
								<td class="subtotal"><span>$350.00</span></td>
								<td class="remove-icon"><a href="#"> <img
										src="img/cart/btn_remove.png" alt="">
								</a></td>
							</tr>
						</tbody>
					</table>
					<div class="shopping-button">
						<div class="continue-shopping">
							<button type="submit">continue shopping</button>
						</div>
						<div class="shopping-cart-left">
							<button type="submit">Clear Shopping Cart</button>
							<button type="submit">Update Shopping Cart</button>
						</div>
					</div>
				</div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-4">
				<div class="discount-code">
					<h3>Discount Codes</h3>
					<p>Enter your coupon code if you have one.</p>
					<input type="text">
					<div class="shopping-button">
						<button type="submit">apply coupon</button>
					</div>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="estimate-shipping">
					<h3>Estimate Shipping and Tax</h3>
					<p>Enter your destination to get a shipping estimate.</p>
					<form action="#">
						<div class="form-box">
							<div class="form-name">
								<label> country <em>*</em>
								</label> <select>
									<option value="1">Afghanistan</option>
									<option value="1">Algeria</option>
									<option value="1">American Samoa</option>
									<option value="1">Australia</option>
									<option value="1">Bangladesh</option>
									<option value="1">Belgium</option>
									<option value="1">Bosnia and Herzegovina</option>
									<option value="1">Chile</option>
									<option value="1">China</option>
									<option value="1">Egypt</option>
									<option value="1">Finland</option>
									<option value="1">France</option>
									<option value="1">United State</option>
								</select>
							</div>
						</div>
						<div class="form-box">
							<div class="form-name">
								<label> State/Province </label> <select>
									<option value="1">Please select region, state or
										province</option>
									<option value="1">Arizona</option>
									<option value="1">Armed Forces Africa</option>
									<option value="1">California</option>
									<option value="1">Florida</option>
									<option value="1">Indiana</option>
									<option value="1">Marshall Islands</option>
									<option value="1">Minnesota</option>
									<option value="1">New Mexico</option>
									<option value="1">Utah</option>
									<option value="1">Virgin Islands</option>
									<option value="1">West Virginia</option>
									<option value="1">Wyoming</option>
								</select>
							</div>
						</div>
						<div class="form-box">
							<div class="form-name">
								<label> Zip/Postal Code </label> <input type="text">
							</div>
						</div>
						<div class="shopping-button">
							<button type="submit">get a quote</button>
						</div>
					</form>
				</div>
			</div>
			<div class="col-sm-4">
				<div class="totals">
					<p>
						subtotal <span>$1,540.00</span>
					</p>
					<h3>
						Grand Total <span>$1,540.00</span>
					</h3>
					<div class="shopping-button">
						<button type="submit">proceed to checkout</button>
					</div>
					<a href="#">Checkout with Multiple Addresses</a>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- cart item area end -->
<!-- footer top area start -->
<div class="footer-top-area">
	<div class="container">
		<div class="row">
			<div class="col-md-3 col-sm-4">
				<div class="footer-contact">
					<img src="img/logo-white.png" alt="">
					<p>Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
						sed diam nonummy nibh euismod tincidunt.</p>
					<ul class="address">
						<li><span class="fa fa-fax"></span> (800) 123 456 789</li>
						<li><span class="fa fa-phone"></span> (800) 123 456 789</li>
						<li><span class="fa fa-envelope-o"></span>
							admin@bootexperts.com</li>
					</ul>
				</div>
			</div>
			<div class="col-md-3 hidden-sm">
				<div class="footer-tweets">
					<div class="footer-title">
						<h3>Latest tweets</h3>
					</div>
					<div class="twitter-feed">
						<div class="twitter-article">
							<div class="twitter-img">
								<a href="#"> <img src="img/twitter/twitter-1.png" alt="">
								</a>
							</div>
							<div class="twitter-text">
								<p>Raboda Fashion #Magento #Theme comes up with pure white
									and grey, which great show your products. Check it:</p>
								<a href="#">https://t.co/iu0OYBwti8</a>
								<div class="twitter-time">
									<a href="#">16h</a>
								</div>
							</div>
						</div>
						<div class="twitter-article">
							<div class="twitter-img">
								<a href="#"> <img src="img/twitter/twitter-1.png" alt="">
								</a>
							</div>
							<div class="twitter-text">
								<p>Raboda Fashion #Magento #Theme comes up with pure white
									and grey, which great show your products. Check it:</p>
								<a href="#">https://t.co/iu0OYBwti8</a>
								<div class="twitter-time">
									<a href="#">16h</a>
								</div>
							</div>
						</div>
					</div>
				</div>
			</div>
			<div class="col-md-3 col-sm-4">
				<div class="footer-support">
					<div class="footer-title">
						<h3>Our support</h3>
					</div>
					<div class="footer-menu">
						<ul>
							<li><a href="#">Sitemap</a></li>
							<li><a href="#">Privacy Policy</a></li>
							<li><a href="#">Your Account</a></li>
							<li><a href="#">Advanced Search</a></li>
							<li><a href="contact.html">Contact Us</a></li>
						</ul>
					</div>
				</div>
			</div>
			<div class="col-md-3 col-sm-4">
				<div class="footer-info">
					<div class="footer-title">
						<h3>Our information</h3>
					</div>
					<div class="footer-menu">
						<ul>
							<li><a href="about-us.html">About Us</a></li>
							<li><a href="#">Customer Service</a></li>
							<li><a href="#">Privacy Policy</a></li>
							<li><a href="#">Orders and Returns</a></li>
							<li><a href="#">Site Map</a></li>
						</ul>
					</div>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- footer top area end -->

<jsp:include page="../layout/footer.jsp" />