// Preloder script
jQuery(window).load(function(){'use strict';
  $(".preloader").delay(5000).fadeOut("slow").remove();
});
jQuery(window).load(function(){'use strict';
  var slideHeight = $(window).height();
  $('#home .carousel-inner .item, #home .video-container').css('height',slideHeight);
  $(window).resize(function(){'use strict',
    $('#home .carousel-inner .item, #home .video-container').css('height',slideHeight);
  });
});
