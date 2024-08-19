import React from "react";
export default class AboutUs extends React.Component {
    render() {
        return (
            <div>
                <div className="about-section"  >
                    <h1 style={{textAlign:"center",color:"green"}}>About Us </h1>
                    <div style={{textAlign:"center"}}>
                       
                    <div/>
                </div>
            </div>
            <br/>

            <h2 style={{textAlign:"center",color:"blue"}}>IACSD March 24</h2>
            <br></br>
                <h2 style={{textAlign:"center"}}>Our Team</h2>
                <div className="row" >

                    <div className="column"  >
                        <div className="card" style={{textAlign:"center"}}>
                            <div className="img" >
                                
                            </div>
                            <div class ="container">
                            <h2>Ayush Johari</h2>
                                                       
                            <p>ayushJohari646@gmail.com</p>
                            <p>Mob:+918349377692</p>
                        </div>
                    </div>
                </div>

                    <div className="column">
                        <div className="card" style={{textAlign:"center"}}>
                            <div className="img" >
                               
                            </div>
                            <div className ="container">
                            <h2>Aditya Gupta</h2>
                            
                            
                            <p>adityagupta@gmail.com</p>
                            <p>Mob:+919575548463</p>
                        </div>
                    </div>                
                </div>
                
                           
                </div>

            </div>
        );
    }
}