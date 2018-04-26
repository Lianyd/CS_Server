//import java.io.IOException;
//import java.io.PrintWriter;
//import java.net.ServerSocket;
//import java.net.Socket;
//
//public class DailyAdviceServer {
//
//    String [] adviceList = {"Take smaller bites", "Go for the tight jeans. No they do not make you look fat", "Think twice before doing","Have fun","Eat some fish", "drink milk"};
//
//    public void go(){
//
//        try {
//            ServerSocket serverSocket = new ServerSocket(4242); // 设置服务器端口为4242
//
//            while (true){ //服务器进入无限循环等待客户端的请求
//                Socket sock = serverSocket.accept(); // 这个方法会停下来等待要求到达之后才会继续
//
//                PrintWriter writer = new PrintWriter(sock.getOutputStream()); // 将服务器数据发送出去
//                String advice = getAdvice();
//                writer.println(advice);
//                writer.close();
//                System.out.println(advice);
//            }
//        }catch (IOException ex){
//            ex.printStackTrace();
//        }
//    }
//
//    private String getAdvice(){
//        int random = (int) (Math.random() * adviceList.length);
//        return adviceList[random];
//    }
//
//    public static void main (String[] args){
//        DailyAdviceServer server = new DailyAdviceServer();
//        server.go();
//    }
//}
