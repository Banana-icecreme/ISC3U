size(1000,800);
background(200,400,400); 
strokeWeight(2); 
stroke(255); 

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
text("CALL",485,160); 

//doors of the TARDIS
fill(0,25,40); 
rectMode(CORNER); 
rect(360,195,130,495); 
rect(510,195,130,495); 

//lines outsideof the door
line(340,187,340,700); 
line(660,187,660,700); 

//2 boxes on top of the main box)
rectMode(CENTER);
rect(500,80,350,40); 
rect(500,45,300,30); 

//lightbox
fill(400,0,0); 
arc(500,200,50,300,0,HALF_PI); 