import socket

IP="127.0.0.1"# destination
PORT=54321# destination
sock=socket.socket(socket.AF_INET,socket.SOCK_DGRAM)
data=input("Enter a text")
#while data != 'end':
    #data = input("message content")
    #print(data)
sock.sendto(data.encode('utf-8'),(IP,PORT))





