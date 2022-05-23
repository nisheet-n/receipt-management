import React from "react";
import { Typography, Grid } from "@material-ui/core";

function Footer(props) {
  return (
    <Grid
      item
      xs={12}
      style={{
        position: "fixed",
        bottom: "0",
        display: "flex",
        marginRight: "5px",
        justifyContent: "center",
        alignItems: "center",
        height: "7vh",
        width: "100vw",
        backgroundColor: "#2C414E",
      }}
    >
      <Typography style={{ color: "white" }}>
        <a href={'https://www.highradius.com/privacy-policy/'} target="_blank"><span style={{ color: '#15AEF2', textDecoration: 'underline' }}>Privacy Policy</span></a> | © 2022 HighRadius Corporation. All rights reserved.
      </Typography>
    </Grid>
  );
}

export default Footer;
