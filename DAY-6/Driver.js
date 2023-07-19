import { Button, Card } from "antd";
import { useNavigate } from "react-router-dom";
function Driver(){
    const nav = useNavigate();
    return(
        <div>

        <Card style={{borderRadius:"20px",backgroundColor:"black"}}>
            <h1 style={{color:"white"}}>Driver</h1>
            <h5 style={{color:"white"}}>Driver Name : Ganapathy</h5>
            <h5 style={{color:"white"}}>Driver Number : 69696969969</h5>
            <h5 style={{color:"white"}}>Driver Vehicle Number : TN 69 BJ6969</h5>
            <h6 style={{color:"white"}}>Your Otp : 6969</h6>
            <br></br>
                <Button onClick={() => nav('/fare')}>
                    View Fare
                </Button>
        </Card>
        <img src="./map.jpg" height={480} width={1550} />
        </div>
    )
}

export default Driver;