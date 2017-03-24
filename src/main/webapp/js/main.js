$(function() {
	var num = 0;
	var timer;
	$('#banner ul>li:eq(0)').css('background', 'red');

	function imgScroll() {
		timer = setInterval(function() {
			num++;
			if(num >= 6) {
				num = 0;

			}
			console.log(num);
			$('#banner ul li').css('background', '#fff');
			$('#banner ul>li:eq(' + num + ')').css('background', 'red');
			$('#banner_main ').animate({ left: -630 * num },
				1500);
		}, 3000);

	}
	imgScroll();
	$('#banner  button').on('mouseover', function() {
		$(this).css('background', 'rgba(0,0,0,0.5)');
	});
	$('#banner  button').on('mouseout', function() {
		$(this).css('background', 'none');
	});
	$('#banner  button').first().on('click', function() {

		clearInterval(timer);
		num--;

		if(num < 0) {
			num = 5;
		}

		$('#banner_main ').animate({ left: -630 * num }, 500);
		$('#banner ul li').css('background', '#fff');
		$('#banner ul>li:eq(' + num + ')').css('background', 'red');
		imgScroll();
	});
	$('#banner  button').last().on('click', function() {
		clearInterval(timer);
		num++;

		if(num >= 6) {
			num = 0;
		}

		$('#banner_main ').animate({ left: -630 * num }, 1000);
		$('#banner ul li').css('background', '#fff');
		$('#banner ul>li:eq(' + num + ')').css('background', 'red');
		imgScroll();
	});

	$('#banner ul>li').on('mouseover', function() {
		clearInterval(timer);
		$('#banner ul>li').css('background', '#fff');
		$(this).css('background', 'red');
		num = $(this).index() * 1;
		$('#banner_main ').animate({ left: -630 * num }, 500);

	});
	$('#banner ul>li').on('mouseout', function() {
		imgScroll();
	});
	$('#banner_main ').on('mouseover', function() {
		clearInterval(timer);
	});
	$('#banner_main ').on('mouseout', function() {
		imgScroll();

	});

});