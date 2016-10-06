<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>index</title>
<link href="css/style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="Grid_Style.css" />
<!--menu script -->
<link rel="stylesheet" type="text/css" href="menu_style.css" />
<link rel="stylesheet" type="text/css" media="all" href="jsDatePick_ltr.min.css" />
<script type="text/javascript" src="js/clockp.js"></script>
<script type="text/javascript" src="js/clockh.js"></script>
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/ddaccordion.js"></script>
<script type="text/javascript" src="js/jquery.1.4.2.js"></script>
<script type="text/javascript" src="datepickerjs/jsDatePick.jquery.min.1.3.js"></script>

<script>
	function proceedPaymentGatewayInfo() {
		var cardNum1 = document.getElementById('txtPan1').value;
		var cardNum2 = document.getElementById('txtPan2').value;
		var cardNum3 = document.getElementById('txtPan3').value;
		var cardNum4 = document.getElementById('txtPan4').value;

		var expMonth = document.getElementById('exp_date_mm').value;

		var expYear = document.getElementById('exp_date_yyyy').value;

		var cvv2 = document.getElementById('cvv2').value;

		var cardName = document.getElementById('card_name').value;

		var email = document.getElementById('email').value;

		var countryCode = document.getElementById('countryCode').value;

		var mobileNumber = document.getElementById('mobileNumber').value;

		var hiddenClinicId = document.getElementById('hidden_clinic_id').value;
		
		var hiddenAppId = document.getElementById('hidden_app_id').value;
		
		var clinicId = document.getElementById('hidden_clinic_id').value;
		
		var appointmentNumber = document.getElementById('hidden_app_id').value;
		

		var sb = [];
		sb[sb.length] = cardNum1;
		sb[sb.length] = cardNum2;
		sb[sb.length] = cardNum3;
		sb[sb.length] = cardNum4;
		var ccNumber = sb.join(" ");

		document.forms.paymentDataSubmitForm.cardNumber.value = ccNumber;
		document.forms.paymentDataSubmitForm.cardNumber1.value = cardNum1;
		document.forms.paymentDataSubmitForm.cardNumber2.value = cardNum2;
		document.forms.paymentDataSubmitForm.cardNumber3.value = cardNum3;
		document.forms.paymentDataSubmitForm.cardNumber4.value = cardNum4;
		document.forms.paymentDataSubmitForm.expirationMonth.value = expMonth;
		document.forms.paymentDataSubmitForm.expirationYear.value = expYear;
		document.forms.paymentDataSubmitForm.ccv2.value = cvv2;
		document.forms.paymentDataSubmitForm.cardName.value = cardName;
		document.forms.paymentDataSubmitForm.email.value = email;
		document.forms.paymentDataSubmitForm.countryCode.value = countryCode;
		document.forms.paymentDataSubmitForm.mobileNumber.value = mobileNumber;
		
		document.forms.paymentDataSubmitForm.clinicId.value = clinicId;
		document.forms.paymentDataSubmitForm.appointmentNumber.value = appointmentNumber;
		
		document.forms.paymentDataSubmitForm.method = "post";
		document.forms.paymentDataSubmitForm.action = "paymentGatewaySupport!processPayementGateway";
		document.forms.paymentDataSubmitForm.submit();
	}

	function makeClear() {

	}

	function channelCenterRegisterFormSubmit(evt) {

	}
</script>

<script type="text/javascript">
	ddaccordion.init({
		headerclass : "submenuheader", //Shared CSS class name of headers group
		contentclass : "submenu", //Shared CSS class name of contents group
		revealtype : "click", //Reveal content when user clicks or onmouseover the header? Valid value: "click", "clickgo", or "mouseover"
		mouseoverdelay : 200, //if revealtype="mouseover", set delay in milliseconds before header expands onMouseover
		collapseprev : true, //Collapse previous content (so only one open at any time)? true/false 
		defaultexpanded : [], //index of content(s) open by default [index1, index2, etc] [] denotes no content
		onemustopen : false, //Specify whether at least one header should be open always (so never all headers closed)
		animatedefault : false, //Should contents open by default be animated into view?
		persiststate : true, //persist state of opened contents within browser session?
		toggleclass : [ "", "" ], //Two CSS classes to be applied to the header when it's collapsed and expanded, respectively ["class1", "class2"]
		togglehtml : [ "suffix", "<img src='images/plus.gif' class='statusicon' />",
				"<img src='images/minus.gif' class='statusicon' />" ], //Additional HTML added to the header when it's collapsed and expanded, respectively  ["position", "html1", "html2"] (see docs)
		animatespeed : "fast", //speed of animation: integer in milliseconds (ie: 200), or keywords "fast", "normal", or "slow"
		oninit : function(headers, expandedindices) { //custom code to run when headers have initalized
			//do nothing
		},
		onopenclose : function(header, index, state, isuseractivated) { //custom code to run whenever a header is opened or closed
			//do nothing
		}
	})
</script>
<!--End menu script -->


<!--left menu Script -->
<link rel="stylesheet" href="css/leftmenu.css">
	<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js"></script>
	<script type="text/javascript">
		$(function() {

			var menu_ul = $('.leftmenu > li > ul'), menu_a = $('.leftmenu > li > a');

			menu_ul.hide();

			menu_a.click(function(e) {
				e.preventDefault();
				if (!$(this).hasClass('active')) {
					menu_a.removeClass('active');
					menu_ul.filter(':visible').slideUp('normal');
					$(this).addClass('active').next().stop(true, true).slideDown('normal');
				} else {
					$(this).removeClass('active');
					$(this).next().stop(true, true).slideUp('normal');
				}
			});

		});
	</script>

	<!-- End left menu Script -->
</head>
<body>


	<!--main -->
	<div id="main">
		<!--head_slice -->
		<div id="head_slice">
			<div id="hs_bar">
				<!--hs_bar -->
			</div>
			<!--End of hs_bar -->
		</div>
		<!--End of head_slice -->

		<!--header -->
		<div id="header">
			<!--h_bar -->
			<div id="h_bar">
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;</div>
				<div>&emsp;&emsp;&emsp;</div>
				<div>
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;
					<s:a href="j_spring_security_logout">Logout</s:a>
				</div>
			</div>
			<!--h_bar -->
		</div>
		<!--header -->

		<!--content -->
		<div id="content">
			<!--content_bar-->
			<div id="content_bar">
				<!--left_bar-->
				<div id="left_bar">

					<!--jquery left menu-->
					<div id="wrapper">

						<ul class="leftmenu">
							<li class="item1"><a href="#">Doctor Management</a>
								<ul>
									<li class="subitem1"><s:a href="doctorManagement/doctorRegistration">Register Doctor</s:a></li>
									<li class="subitem2"><s:a href="doctorSpeciality">Doctor Speciality</s:a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item2"><a href="#">Channel Center Management</a>
								<ul>
									<li class="subitem1"><s:a href="ChennelCenterRegistration">Register Channel Center</s:a></li>
									<li class="subitem2"><a href="#">Channel Center Operations<span>6</span>
									</a></li>
									<li class="subitem3"><a href="#">Administrator Functions<span>2</span>
									</a></li>
								</ul></li>
							<li class="item3"><a href="#">Medical Clinic Management</a>
								<ul>
									<li class="subitem1"><s:a href="registerClinic">Register Clinic</s:a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item4"><a href="#">Appointment Management</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item5"><a href="#">Channeling</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
							<li class="item3"><a href="#">Medical Test</a>
								<ul>
									<li class="subitem1"><a href="#">Cute Kittens <span>14</span></a></li>
									<li class="subitem2"><a href="#">Strange “Stuff” <span>6</span></a></li>
									<li class="subitem3"><a href="#">Automatic Fails <span>2</span></a></li>
								</ul></li>
						</ul>

					</div>
					<!--End jquery left menu-->

				</div>
				<!--End left_bar-->
				<form action="" id="paymentDataSubmitForm">
					<input type="hidden" name="cardNumber1" id="card_number_1" /> <input type="hidden" name="cardNumber2"
						id="card_number_2" /> <input type="hidden" name="cardNumber3" id="card_number_3" /> <input type="hidden"
						name="cardNumber4" id="card_number_4" /> <input type="hidden" name="cardNumber" id="card_number" /> <input
						type="hidden" name="expirationMonth" id="expiration_month" /> <input type="hidden" name="expirationYear"
						id="expiration_year" /> <input type="hidden" name="ccv2" id="ccv2" /> <input type="hidden" name="cardName"
						id="card_nameX" /> <input type="hidden" name="email" id="email" /> <input type="hidden" name="countryCode"
						id="country_code" /> <input type="hidden" name="mobileNumber" id="mobile_number" /> <input type="hidden"
						name="clinicId" /> <input type="hidden" name="appointmentNumber" />

				</form>
				<!--right_bar-->
				<div id="right_bar">

					<table align="center" border="0" width="100%" bordercolor="red">
						<tbody>
							<tr>

								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td>&nbsp;</td>
								<td width="110%">
									<center>
										<font color="#3b4455" face="verdana"><b> <font size="2"> </font><br> <img
													src="./SampathBankSecurePaymentGateway_files/sampathlogo.jpg" border="0" alt="Sampath Bank"><br>
															<font size="1">Secure Payment Gateway</font></b></font>
									</center>
								</td>
								<form method="post" name="pgForm" action="" onsubmit="">

									<table cellspacing="1" cellpadding="1" align="center" border="0" width="450" bordercolor="yellow">
										<tbody>
											<tr>
												<td>
													<table cellspacing="1" cellpadding="1" align="center" border="0" width="500" bordercolor="red">


														<tbody>
															<tr>
																<td align="center"><img src="./SampathBankSecurePaymentGateway_files/1pixel.gif" width="1"
																	height="1" alt=""></td>
															</tr>


															<tr>
																<td align="center" colspan="3"><font face="Verdana" size="1" color="#408080"><b> We
																			accept&nbsp; credit and debit cards from VISA and MasterCard. </b></font></td>
															</tr>

															<tr>
																<td align="right" valign="middle"><font face="Verdana" size="1"><b> Card Number<font
																			color="red">*</font></b></font></td>
																<td valign="left">&nbsp; <input autocomplete="off" type="text" name="cardNum1" id="txtPan1"
																	maxlength="19" size="4" onkeyup="next_focus(this,document.pgForm.cardNum2)" value="" tabindex="1"
																	style="color: black;" /> <input autocomplete="off" type="text" name="cardNum2" id="txtPan2"
																	maxlength="4" size="4" onkeyup="next_focus(this,document.pgForm.cardNum3)" value="" tabindex="2"
																	style="color: black;" /> <input autocomplete="off" type="text" name="cardNum3" id="txtPan3"
																	maxlength="4" size="4" onkeyup="next_focus(this,document.pgForm.cardNum4)" value="" tabindex="3"
																	style="color: black;" /> <input autocomplete="off" type="text" name="cardNum4" id="txtPan4"
																	maxlength="7" size="7" value="" tabindex="4" style="color: black;" /></td>
															</tr>
															<tr>
																<td align="right"><font face="Verdana" size="1"><b> Expiry Date <font color="red">*</font></b></font></td>
																<td align="left"><font face="Verdana" size="1">&nbsp; <select name="exp_date_mm"
																		tabindex="5" id="exp_date_mm">
																			<option value="MM">MM</option>

																			<option value="01">01</option>

																			<option value="02">02</option>

																			<option value="03">03</option>

																			<option value="04">04</option>

																			<option value="05">05</option>

																			<option value="06">06</option>

																			<option value="07">07</option>

																			<option value="08">08</option>

																			<option value="09">09</option>

																			<option value="10">10</option>

																			<option value="11">11</option>

																			<option value="12">12</option>

																	</select> <select name="exp_date_yyyy" tabindex="6" id="exp_date_yyyy">
																			<option value="YYYY">YYYY</option>

																			<option value="2014">2014</option>


																			<option value="2015">2015</option>


																			<option value="2016">2016</option>


																			<option value="2017">2017</option>


																			<option value="2018">2018</option>


																			<option value="2019">2019</option>


																			<option value="2020">2020</option>


																			<option value="2021">2021</option>


																			<option value="2022">2022</option>


																			<option value="2023">2023</option>


																			<option value="2024">2024</option>


																			<option value="2025">2025</option>


																			<option value="2026">2026</option>


																			<option value="2027">2027</option>


																			<option value="2028">2028</option>


																			<option value="2029">2029</option>


																			<option value="2030">2030</option>


																			<option value="2031">2031</option>


																			<option value="2032">2032</option>


																			<option value="2033">2033</option>


																			<option value="2034">2034</option>


																			<option value="2035">2035</option>


																			<option value="2036">2036</option>


																			<option value="2037">2037</option>


																			<option value="2038">2038</option>


																	</select></font></td>
															</tr>
															<tr>
																<td align="right"><font face="Verdana" size="1"><b> CVV2/CVC2<font color="red">*</font>
																	</b></font></td>
																<td align="left">&nbsp; <input autocomplete="off" type="password" name="cvv2" id="cvv2" size="4"
																	maxlength="4" value="" tabindex="7" onfocus="luhn_check_notify()" /></td>
															</tr>
															<tr>
																<td align="right"><font face="verdana" size="1"><b>Card Name<font color="red">*</font></b></font></td>
																<td align="left">&nbsp; <input autocomplete="off" type="text" name="name_on_card" size="25"
																	maxlength="30" value="" tabindex="8" id="card_name" /></td>
															</tr>
															<tr>
																<td align="right"><font face="verdana" size="1"><b>E-Mail&nbsp;&nbsp;&nbsp;</b></font></td>
																<td align="left">&nbsp; <input type="text" name="email" size="25" maxlength="50" value=""
																	tabindex="9" autocomplete="off" id="email" /></td>
															</tr>
															<tr>
																<td align="right"><font face="verdana" size="1"><b>Mobile No</b></font></td>
																<td align="left">+ <input type="text" name="mobile_country_code" value="" size="3" maxlength="3"
																	tabindex="9" autocomplete="off" id="countryCode" /> - <input type="text" name="mobile_number" value=""
																	size="13" maxlength="13" tabindex="9" autocomplete="off" id="mobileNumber" /></td>
															</tr>
															<tr>
																<td align="right"><font face="verdana" size="1"><b> Merchant &nbsp;&nbsp;</b></font></td>
																<td align="left"><font face="verdana" size="2" color="#FF8000">&nbsp;&nbsp;<b>FastChanneling</b></font></td>
															</tr>
															<tr>
																<td align="right"><font face="verdana" size="1"><b> Amount&nbsp;&nbsp;</b></font></td>
																<td align="left">&nbsp;&nbsp;&nbsp; <font face="verdana" size="2" color="#408080"><b>LKR
																			2000.00</b></font></td>
															</tr>

															<tr>
																<td align="center" colspan="2">

																	<table border="0" class="captcha" align="center" width="450" cellspacing="1" cellpadding="1">

																		<tbody>
																			<tr>
																				<td><img src="./SampathBankSecurePaymentGateway_files/1pixel.gif" width="1" height="1" alt=""></td>
																			</tr>
																			<tr>
																				<td align="right" valign="top" width="28%"><img
																					src="./SampathBankSecurePaymentGateway_files/1pixel.gif" width="1" height="8" alt=""><br>
																							<font face="Verdana" size="1"><b>Word Verification<font color="red">*</font></b></font><br><img
																								src="./SampathBankSecurePaymentGateway_files/1pixel.gif" width="1" height="1" alt=""></td>

																				<td align="left" width="72%">
																					<table align="left" cellspacing="0" cellpadding="1">
																						<tbody>
																							<tr>
																								<td valign="middle"><img src="./SampathBankSecurePaymentGateway_files/getSimpleCaptcha.png"
																									id="captchaimage" name="captchaimage"> &nbsp;<a href="javascript:displayimage();"
																										title="Click to change the verification image" style="text-decoration: none"><font
																											face="Verdana" size="1" color="#808080"><b>[change]</b></font></a></td>
																							</tr>

																							<tr>
																								<td valign="middle"><input type="text" name="captchaValue" id="captchaValue" value=""
																									maxlength="10" size="12" tabindex="10" autocomplete="off"><font face="Verdana" size="1"
																										color="#808080">&nbsp;</font></td>
																							</tr>
																						</tbody>
																					</table>
																				</td>
																			</tr>
																		</tbody>
																	</table> <script language="JavaScript">
																		var c;
																		objImage = new Image();

																		function download(num) {
																			//objImage = new Image()
																			objImage.src = '/AccosaPG/jsp/getSimpleCaptcha.jsp?a='
																					+ num;
																		}

																		function displayimage() {
																			c = Math.random();
																			download(c);
																			document.getElementById("captchaValue").value = "";
																			document.getElementById("captchaimage").src = '/AccosaPG/jsp/getSimpleCaptcha.jsp?a='
																					+ c;
																		}
																	</script>
																</td>
															</tr>
														</tbody>
													</table>
												</td>
											</tr>
											<tr>
												<td align="center">
													<div id="cmd123456" style="visibility: visible">

														<input type="button" name="cmdSubmit" id="cmdSubmit" value="Pay" title="Click here to Pay"
															style="FONT-WEIGHT: bold; COLOR: #ffefd5; BACKGROUND-COLOR: #708090"
															onclick="proceedPaymentGatewayInfo()" tabindex="12">
															&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; <input
															type="button" name="cmdSubmit" id="cmdSubmit" value="Cancel" title="Click here to cancel"
															style="FONT-WEIGHT: bold; COLOR: #ffefd5; BACKGROUND-COLOR: #708090"
															onclick="proceedPaymentGatewayInfo()" tabindex="12">
													</div>
													<div id="showtext" style="visibility: hidden" class="footNotes">
														<font size="2" color="#009933"><img src="./SampathBankSecurePaymentGateway_files/wait.gif"
															width="100" height="9" alt="please wait..."></font>
													</div> <span class="normal"></span><input type="hidden" name="clinicId" id="hidden_clinic_id"
													value="<s:property value="clinicId" />" /> <input type="hidden" name="appointmentNumber"
													id="hidden_app_id" value="<s:property value="appointmentNumber" />" />
												</td>

											</tr>

											<tr>
												<td align="center"><img src="./SampathBankSecurePaymentGateway_files/vbv_small_logo.gif" width="113"
													height="60" border="0" alt="Verified by VISA">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img
														src="./SampathBankSecurePaymentGateway_files/securecode_small_logo.gif" width="113" height="60" border="0"
														alt="MasterCard SecureCode"></td>
											</tr>

										</tbody>
									</table>
								</form>


								<td width="20%" align="right">&nbsp;</td>
							</tr>
						</tbody>
					</table>
					</br> </br>


				</div>
				<!--End right_bar-->
			</div>
			<!--End content_bar -->
		</div>
		<!--End content -->

		<!--footer -->
		<div id="footer">
			<!--footer_bar-->
			<div id="footer_bar"></div>
			<!--footer_bar -->
		</div>
		<!--footer -->
	</div>
	<!--end of main -->
</body>
</html>