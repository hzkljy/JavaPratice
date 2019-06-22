class Message {
	private Channel channel; // 保存消息发送的通道
	private String title;    // 消息标题
	private String content;  // 消息的内容
	
	// [4]调用此构造实例化 此时channel = 主类ch
	public Message(Channel channel, String title, String content) {
		this.channel = channel;
		this.title = title;
		this.content = content;
	}
	
	public void send() {
		// [6]判断当前通道是否可用，内么此时的this.channel就是主类的ch
		if(this.channel.isConnect()) {
			// 连接成功
			System.out.println("[消息发送]title = " + this.title + "、content = " + this.content);
		} else {
			// 连接失败
			System.out.println("[ERROR]没有可用的通道，无法进行消息发送。");
		}
	}
}

class Channel {
	private Message message; // 消息发送由Message负责
	
	// [2]实例化Channel类对象 调用构造方法 接收要发送的消息标题与消息内容
	public Channel(String title, String content) {
		// [3]实例化Message 但是需要将主类中的ch传递到Message中 this = ch
		this.message = new Message(this, title, content);
		// [5]消息发送
		this.message.send(); 
	}
	
	// 以后在进行方法创建的时候，如果某一个方法的名称是以is开头，一般都是返回boolean值
	public boolean isConnect() { // 判断连接是否创建
		return true; // 默认返回true
	}
	
}

// 实现消息的发送
public class ThisMessage {
	public static void main(String[] args) {
		System.out.println("实现消息发送");
		
		// [1]实例化一个Channel对象，并且传入要发送的标题和消息内容
		Channel ch = new Channel("亿道运动会", "大家周末需要去爬银瓶山!!!");
	}
}
