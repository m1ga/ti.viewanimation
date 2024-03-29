# ti.viewanimation

<img src="ani.gif"/>
<br/>

Using [AndroidViewAnimations](https://github.com/daimajia/AndroidViewAnimations) in Titanium

## Example

```js
const VIEW_ANIMATION = require("ti.viewanimation");
var ani;
const win = Ti.UI.createWindow();
const view = Ti.UI.createView({
	width: 200,
	height: 200,
	backgroundColor: "red"
});
win.add(view);
win.addEventListener("open", function(e) {
	ani = VIEW_ANIMATION.animate({
		view: view,
		type: VIEW_ANIMATION.RUBBERBAND,
		duration: 500,
		repeat: -1	//
	});

	// stop animation after 3 seconds
	setTimeout(function(){
		ani.stop();
	}, 3000)
})

win.open();
```

## Methods
* animate({view, duration, repeat, repeatMode, type, delay}) -> returns animation

### animation methods
* stop()

### animation properties
* isRunning
* isStarted

## Events
* start
* cancel
* done

## Constants

use the following animation type constants:

* FLASH
* PULSE
* RUBBERBAND
* SHAKE
* SWING
* WOBBLE
* BOUNCE
* TADA
* STANDUP
* WAVE
* HINGE
* ROLLIN
* ROLLOUT
* LANDING
* TAKINGOFF
* DROPOUT
* BOUNCEIN
* BOUNCEINDOWN
* BOUNCEINLEFT
* BOUNCEINRIGHT
* BOUNCEINUP
* FADEIN
* FADEINUP
* FADEINDOWN
* FADEINLEFT
* FADEINRIGHT
* FADEOUTDOWN
* FADEOUTLEFT
* FADEOUTRIGHT
* FADEOUTUP
* FLIPINX
* FLIPOUTX
* FLIPOUTY
* ROTATEIN
* ROTATEINDOWNLEFT
* ROTATEINDOWNRIGHT
* ROTATEINUPLEFT
* ROTATEINUPRIGHT
* ROTATEOUTDOWNLEFT
* ROTATEOUTDOWNRIGHT
* ROTATEOUTUPLEFT
* ROTATEOUTUPRIGHT
* SLIDEINLEFT
* SLIDEINRIGHT
* SLIDEINUP
* SLIDEINDOWN
* SLIDEOUTLEFT
* SLIDEOUTRIGHT
* SLIDEOUTUP
* SLIDEOUTDOWN
* ZOOMIN
* ZOOMINDOWN
* ZOOMINLEFT
* ZOOMINRIGHT
* ZOOMINUP
* ZOOMOUTDOWN
* ZOOMOUTLEFT
* ZOOMOUTRIGHT
* ZOOMOUTUP


repeatMode:
* REPEAT_RESTART
* REPEAT_REVERSE
