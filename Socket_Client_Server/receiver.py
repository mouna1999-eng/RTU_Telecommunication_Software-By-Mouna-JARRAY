import socket
IP="127.0.0.1"# local adress
PORT=54321#  local port
sock=socket.socket(socket.AF_INET,# Internet
                   socket.SOCK_DGRAM)# UDP
sock.bind((IP,PORT))# association of the socket with IP/PORT
data,addr=sock.recvfrom(1024)# waiting of msg ...
#data2,addr=sock.recvfrom(1024)
print("sender : ",addr)
print("data   : ",data.decode('utf-8'))

#data2 = input("message content")
#while data != 'fin':
    #print(data2)
    #sock.sendto(data.encode('utf-8'),(IP,PORT))




