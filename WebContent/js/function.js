$(function() {

	$("#userdaohang ul li").hover(function() {
		$(this).find("dl dd").show();

	}, function() {
		$(this).find("dl dd").hide();
	});
	
	
	$("#daohang ul :not(li[a=false])").hover(function(){
		
		$(this).parent().css("background","#00CCFF");
		
	},function(){
		
		$(this).parent().css("background","#FF66FF");
		
	});
	
	$("#userdaohang ul li").hover(function(){
		
		$(this).css("background","#f60");
		
	},function(){
		
		$(this).css("background","#00CCFF");
		
	});

})

$(function() {
	var isSave = false;

	window.onbeforeunload = function(event) {
		
		setTimeout(function(){
			$.getJSON('cart2db.action', '', function(data) {

				if (data.flag) {
					alert(num);
				}

			});

		}, 1000)
	}

	window.onunload = function() {
		if (!isSave) {
			$.getJSON('cart2db.action', '', function(data) {

				if (data.flag) {
					alert(num);
				}

			});

			
		}

	}

})
