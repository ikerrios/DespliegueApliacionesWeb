<?php
/**
 * @package Scary Halloween 
 * Setup the WordPress core custom header feature.
 *
 * @uses scary_halloween_header_style()
*/
function scary_halloween_custom_header_setup() {
	add_theme_support( 'custom-header', apply_filters( 'scary_halloween_custom_header_args', array(
		'header-text' 			 =>	false,
		'width'                  => 1200,
		'height'                 => 70,
		'flex-width'    		 => true,
		'flex-height'    		 => true,
		'wp-head-callback'       => 'scary_halloween_header_style',
	) ) );
}
add_action( 'after_setup_theme', 'scary_halloween_custom_header_setup' );

if ( ! function_exists( 'scary_halloween_header_style' ) ) :
/**
 * Styles the header image and text displayed on the blog
 *
 * @see scary_halloween_custom_header_setup().
 */
add_action( 'wp_enqueue_scripts', 'scary_halloween_header_style' );

function scary_halloween_header_style() {
	if ( get_header_image() ) :
	$custom_css = "
        .home-page-header, .page-template-custom-home-page .main-topbar{
			background-image:url('".esc_url(get_header_image())."');
			background-position: center top;
		    background-size: cover;
		}";
	   	wp_add_inline_style( 'scary-halloween-basic-style', $custom_css );
	endif;
}
endif;