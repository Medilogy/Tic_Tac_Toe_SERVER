//interfejs ktorego zadaniem jest wysylanie wiadomosci na podstawie przeslanej wiadomosci

public interface RequestListener {

    Message onMessageRecived(Message request);
}
