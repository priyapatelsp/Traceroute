
<h1>Build Your Own Traceroute</h1>

This challenge is to Build Your Own Traceroute.
This tool is build as part of <a href="https://codingchallenges.fyi/challenges/challenge-traceroute">coding challenges</a> .


```
The Internet is a large and complex aggregation of network hardware, connected together by gateways.
Tracking the route one's packets follow(or finding the miscreant gateway that's discarding your packets)
can be difficult. traceroute utilizes the IP protocol `time to live' field and attempts to elicit an ICMP TIME_EXCEEDED
response from each gateway along the path to some host.
```

<h1>Get started </h1>
This tool is in Java , so please ensure that you have latest version installed in your device 
<br><br>

step 1: git clone https://github.com/priyapatelsp/Traceroute.git

step 2: Open folder and inside run traceroute.java


```
---------------------------------------------------------
Usage 1: cctraceroute www.google.com
Usage 2: exit (to exit program) 
---------------------------------------------------------
 cctraceroute dns.google.com
```

you will get the output similar to 

```
1  192.168.68.1 (192.168.68.1)
2  broadband (192.168.1.1)
3  *  * *
4  63.130.172.45 (63.130.172.45)
5  72.14.216.236 (72.14.216.236)
6  *  * *
7  dns.google (8.8.4.4)
```

<h2>Helpful resources </h2>

<a href ="https://codingchallenges.fyi/challenges/challenge-traceroute"> traceoute</a><br>
<a href="https://www.youtube.com/watch?v=aZxzkJ_a5eU">traceoute youtube </a> <br>



<h1>Author</h1><br>
Priya Patel <br>
Github : <a href="https://github.com/priyapatelsp">priyapatelsp</a>
