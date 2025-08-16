##### Behavioral Design Pattern
Requirement

Design a text editor app. It should support text transformation like uppercasing,
lowercasing and so on, on the selected text. It should notify other systems like 
console or printer whenever the text is updated.

--------------------------
Stratergy - use to perform different text transformation
Observer - notify other systems when the text is updated
Command - As per my understanding here it helps to create loosely coupled component
where it consolidates an action(setting text to uppercase) on a client (Text editor)