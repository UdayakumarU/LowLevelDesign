### Structural Design Pattern

Design a multi media player which supports Image, Video and Audio files.

The application should handle different media formats, resolution, provides efficient storage and enable seemless playback for users.


-----------------------------------

1. Adaptor pattern - image file to compatible with media player ie play()
2. Decorator pattern - render same content in different resolution, compression etc
3. Composite design pattern - to treat Media and group of Media same ie in this case i can play() media all at once
