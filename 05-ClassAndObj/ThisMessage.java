class Message {
	private Channel channel; // ������Ϣ���͵�ͨ��
	private String title;    // ��Ϣ����
	private String content;  // ��Ϣ������
	
	// [4]���ô˹���ʵ���� ��ʱchannel = ����ch
	public Message(Channel channel, String title, String content) {
		this.channel = channel;
		this.title = title;
		this.content = content;
	}
	
	public void send() {
		// [6]�жϵ�ǰͨ���Ƿ���ã���ô��ʱ��this.channel���������ch
		if(this.channel.isConnect()) {
			// ���ӳɹ�
			System.out.println("[��Ϣ����]title = " + this.title + "��content = " + this.content);
		} else {
			// ����ʧ��
			System.out.println("[ERROR]û�п��õ�ͨ�����޷�������Ϣ���͡�");
		}
	}
}

class Channel {
	private Message message; // ��Ϣ������Message����
	
	// [2]ʵ����Channel����� ���ù��췽�� ����Ҫ���͵���Ϣ��������Ϣ����
	public Channel(String title, String content) {
		// [3]ʵ����Message ������Ҫ�������е�ch���ݵ�Message�� this = ch
		this.message = new Message(this, title, content);
		// [5]��Ϣ����
		this.message.send(); 
	}
	
	// �Ժ��ڽ��з���������ʱ�����ĳһ����������������is��ͷ��һ�㶼�Ƿ���booleanֵ
	public boolean isConnect() { // �ж������Ƿ񴴽�
		return true; // Ĭ�Ϸ���true
	}
	
}

// ʵ����Ϣ�ķ���
public class ThisMessage {
	public static void main(String[] args) {
		System.out.println("ʵ����Ϣ����");
		
		// [1]ʵ����һ��Channel���󣬲��Ҵ���Ҫ���͵ı������Ϣ����
		Channel ch = new Channel("�ڵ��˶���", "�����ĩ��Ҫȥ����ƿɽ!!!");
	}
}
