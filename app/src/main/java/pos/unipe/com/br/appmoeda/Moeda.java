package pos.unipe.com.br.appmoeda;

import android.provider.ContactsContract;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Moeda {

    @JsonProperty("1. From_Currency Code")
    private String from_Currency_Code;

    @JsonProperty("2. From_Currency Name")
    private String from_Currency_Name;

    @JsonProperty("3. To_Currency Code")
    private String to_Currency_Code;

    @JsonProperty("4. To_Currency Name")
    private String to_Currency_Name;

    @JsonProperty("5. Exchange Rate")
    private String exchange_Rate;

    @JsonProperty("6. Last Refreshed")
    private String last_Refreshed;

    @JsonProperty("7. Time Zone")
    private String time_Zone;

    public String getFrom_Currency_Code() {
        return from_Currency_Code;
    }

    public void setFrom_Currency_Code(String from_Currency_Code) {
        this.from_Currency_Code = from_Currency_Code;
    }

    public String getFrom_Currency_Name() {
        return from_Currency_Name;
    }

    public void setFrom_Currency_Name(String from_Currency_Name) {
        this.from_Currency_Name = from_Currency_Name;
    }

    public String getTo_Currency_Code() {
        return to_Currency_Code;
    }

    public void setTo_Currency_Code(String to_Currency_Code) {
        this.to_Currency_Code = to_Currency_Code;
    }

    public String getTo_Currency_Name() {
        return to_Currency_Name;
    }

    public void setTo_Currency_Name(String to_Currency_Name) {
        this.to_Currency_Name = to_Currency_Name;
    }

    public String getExchange_Rate() {
        return exchange_Rate;
    }

    public void setExchange_Rate(String exchange_Rate) {
        this.exchange_Rate = exchange_Rate;
    }

    public String getLast_Refreshed() {
        return last_Refreshed;
    }

    public void setLast_Refreshed(String last_Refreshed) {
        this.last_Refreshed = last_Refreshed;
    }

    public String getTime_Zone() {
        return time_Zone;
    }

    public void setTime_Zone(String time_Zone) {
        this.time_Zone = time_Zone;
    }

    @Override
    public String toString() {
        return "Moeda{" +
                "from_Currency_Code='" + from_Currency_Code + '\'' +
                ", from_Currency_Name='" + from_Currency_Name + '\'' +
                ", to_Currency_Code='" + to_Currency_Code + '\'' +
                ", to_Currency_Name='" + to_Currency_Name + '\'' +
                ", exchange_Rate='" + exchange_Rate + '\'' +
                ", last_Refreshed='" + last_Refreshed + '\'' +
                ", time_Zone='" + time_Zone + '\'' +
                '}';
    }
}
