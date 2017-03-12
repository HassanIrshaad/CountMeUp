# CountMeUp

To run the program, simply copy or open the file named Main into any IDE that can run Java and run the code, you can change the values stored in the main function which act as the total number of votes and percentage each candidate gained to test the program. 
The output will be the number of votes each candidate got and the time taken to run the program.

The total execution time was 41ms.

Assumptions:
- I wasn't sure about the whole user voting part, at first I thought I was jut supposed to create a function/program that simply counted the votes per 
  candidate and supplied an output for the number of votes each candidate got, but with the user validation feature, I got confused.
- I created a Counter function which assumes the values were already given to the program in a decimal format and then calculates the rest.

Difficulties:
- My knowldege of doing front end development for websites from scratch isn't great, therefore I didn't know where to start with that.
- When I did my work placement, all the client-server connections were already in place, so I had to just do the back-end coding with a little front end.
- I found this challenge particularly diffuclt due to my lack in front end development knowledge from scratch.
- I was also particularly confused by how the program if created as a web site with a client-server model, would produce percentages for the votes per candidate? It would seem extremely inefficient to me for the program to first get the number of votes which it would already have because it would just be using an in-built counter to tally the votes, then to convert that to a percentage then to the number ot started with? This is where my assumption of programming just the function made sense to me rather than creating the whole system.

Solution:
- The back end portion of the problem was simple, it's just a case of passing values through to the function and doing the appropriate calculations to find the number of votes.

Further work:
- I'm sure if I had more time to run through the process of locally setting up my tomcat servers and running my web app on it, as well as remembering how to send data back and forth between client and server, 
  then I could have achieved the full process of allowing users to vote and see the rsults of the competition.
- I managed to create a web page which allowed the user to vote only 3 times and could vote for 1 candidate 3 times or 
  3 different ones but I ran into a wall trying to figure out how to keep a hold of the votes, transfer those to a local data store, send them to the countmeup function I programmed and then present the data back to the web page.
- I can design and format the web page, do the back end calculation and programming but the middle area is where I struggle.  
