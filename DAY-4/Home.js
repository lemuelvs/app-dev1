import { Link } from "react-router-dom";
// import { FaShoppingCart } from "react-icons/fa";
// import Navbar from '../nav.js';
import './Home.css';
import FormBook from "./Form";
import { Button } from "antd";
// import img from '../components/bg.jpg';

export default function Home() {
  return (
    <div className="homeContainer" style={{ display: "flex" }}>
      {/* <Navbar/> */}
      {/* <div className="content">
      <h1 style={{fontSize:"50px"}}>Book your most preferable ride</h1>
      <div className="container">
      <div className="content">
        
        <b>SIUHU</b>

      </div>
    </div>

  </div> */}
      <div style={{ marginLeft: 0, height: "714px", backgroundColor: "black", width: "800px" }}>
        <h1 style={{ fontSize: "50px" ,color:"white"}}>Book your most preferable ride</h1>
        <h1 style={{ fontSize: "50px" ,marginLeft:"-250px",marginTop:"50px",color:"white"}}>Siuhu</h1>
        {/* <h5 style={{ fontSize: "30px" ,marginTop:"190px",color:"white"}}>Your Journey,</h5>
        <h5 style={{ fontSize: "30px" ,marginTop:"10px",color:"white"}}>Our Priority</h5> */}
  
      {/* <button className="button-known" style={{marginTop:"80px",width:"150px"}}>
        <Link to="/product" className="content">
          <p style={{color:"black"}}>

          Get Started
          </p>
        </Link>
      </button> */}
      <FormBook/>
      <button className="button-known" style={{marginTop:"30px",borderRadius:"5px"}}>
        <Link to="/about  " className="content">
          <Button>
            About
          </Button>
        </Link>
      </button>
      </div>
      <div>
        <img src="./siuhu.png" width={750} height={714} ></img>
      </div>

    </div>
  );
}