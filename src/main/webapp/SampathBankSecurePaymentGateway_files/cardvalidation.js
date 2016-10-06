
/*******************************************************
This Javascript is for validating the card information 
this includes Luhn's Algorthm for card verification.
and other utility functions related to card verification
*********************************************************/

	function luhn_check(number) {
		var number=number.replace(/\D/g, '');
		var number_length=number.length;
		var parity=number_length % 2;
		var total=0;

		for (i=0; i < number_length; i++) {
			var digit=number.charAt(i);
			if (i % 2 == parity) {
				digit=digit * 2;
				if (digit > 9) {
					digit=digit - 9;
				}
			}
			total = total + parseInt(digit);
		} 
		
		if (total % 10 == 0) {
			return true;
		} else {
			return false;
		}
	}

	function chek_visa_or_master(number) { 
		var nLen=number.length;
		var type='';
		if((number.substring(0,1) == '4') && (nLen == 13 || nLen == 16)) {
			type = 'Visa';
			document.pgForm.card_type.value = "V";
			document.pgForm.card_type[0].checked = true;
		} else if((number.substring(0,2) == '51' || number.substring(0,2) == '52'
				|| number.substring(0,2) == '53' || number.substring(0,2) == '54'
				|| number.substring(0,2) == '55') && (nLen == 16 || nLen == 19)) {
			type = 'Master Card';
			document.pgForm.card_type.value="M";
			document.pgForm.card_type[1].checked=true;
		}
	}