import { Button } from 'antd'
import {useNavigate} from 'react-router-dom'
import './Home.css'
export default function Fare() {
    const nav = useNavigate();
    return (
        <div id="fare">
            <div id='con'>
                <div id='f1'>
                    <h3>
                        Bike
                    </h3>
                    <p>
                        RS:40/-
                    </p>
                </div>
                <div id='f2'>
                    <h3>
                        Auto
                    </h3>
                    <p>
                        RS:60/-
                    </p>
                </div>
            </div>
            <div id='but'>
            <Button onClick={() => nav('/driver')}>Book Ride</Button>
            </div>
        </div>
    )
}