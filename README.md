# OS assignment 2
## Observations
If we run the program without synchronizing the threads then each thread will read that the ticket server has 10 
available tickets. Now if we synchronize the threads it will block the other threads from accessing the shared memory
while one of the threads is accessing it.

Without synchronization:
```
Hi,Ilaria : 10 : Seats available for Troll
Hi,Xiangming : 10 : Seats available for Troll
Hi,Sam : 10 : Seats available for Troll
Hi,Andreas : 10 : Seats available for Troll
Hi,Xiangming : 3 Seats booked successfully for Troll
Hi,Ilaria : 2 Seats booked successfully for Troll
Hi,Andreas : 4 Seats booked successfully for Troll
Hi,Sam : 3 Seats booked successfully for Troll
```

With synchronization:
```
Hi,Xiangming : 10 : Seats available for Troll
Hi,Xiangming : 3 Seats booked successfully for Troll
Hi,Andreas : 7 : Seats available for Troll
Hi,Andreas : 4 Seats booked successfully for Troll
Hi,Sam : 3 : Seats available for Troll
Hi,Sam : 3 Seats booked successfully for Troll
Hi,Ilaria : 0 : Seats available for Troll
Hi,Ilaria : Seats not available for Troll
```

## How to run the code
Run the main function in the Main.java file.
