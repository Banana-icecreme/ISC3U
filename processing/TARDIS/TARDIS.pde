size(1000,800);
background(200,400,400); 
strokeWeight(2); 
stroke(255); 

//lightbox
fill(250,200,0); 
ellipse(500,30,30,60); 

//big box
fill(0,25,40); 
rectMode(CENTER); 
rect(500,400,400,600); 

//polic sign
fill(0,30,40); 
rect(500,150,350,70); 
fill(0,25,40); 
rect(500,150,325,60); 
fill(255); 
textSize(25);  
text("POLICE                  BOX",355,160);    
textSize(15);
text("PUBLIC",478,145);
text("CALL",485,162); 

//doors of the TARDIS
fill(0,25,40); 
rectMode(CORNER); 
rect(360,195,130,495); 
rect(510,195,130,495); 

//lines outside of the door
line(340,187,340,700); 
line(660,187,660,700); 

//2 boxes on top of the main box)
rectMode(CENTER);
rect(500,80,350,40); 
rect(500,45,300,30); 

//Windows on left door
rect(426,260,90,100); 
rect(426,375,90,100); 
rect(426,490,90,100); 
rect(426,615,90,100); 

//window on right door
rect(574,260,90,100); 
rect(574,375,90,100); 
rect(574,490,90,100); 
rect(574,615,90,100); 

//bars in left window
rect(403.5,285,45,50);
rect(448.5,235,45,50);

//bars in right window
rect(596.5,285,45,50);
rect(551.5,235,45,50);

//box on the very bottom
rect(500,715,450,30); 