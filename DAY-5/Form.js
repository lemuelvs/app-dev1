import React, { useState } from 'react';
import { Button, Form, Input, Select } from 'antd';
import { Link } from 'react-router-dom';
const { Option } = Select;
const layout = {
    labelCol: {
        span: 8,
    },
    wrapperCol: {
        span: 16,
    },
};
const tailLayout = {
    wrapperCol: {
        offset: 8,
        span: 16,
    },
};
const FormBook = () => {


    const [drop, SetDrop] = useState("");
    const [cur, SetCur] = useState("");


    return (
        <div style={{ display: "flex", justifyContent: "center", height: "414px", marginTop: "30px" }}>
            {/* backgroundImage: "url(./map.jpg)" */}
            {/* <Form
                // {...layout}

                name="control-ref"

                style={{
                    maxWidth: 600,
                    marginTop: "150px",
                }}
            >
                <Form.Item
                    name="notess"
                    rules={[
                        {
                            required: true,
                        },
                    ]}
                >
                    <Input placeholder='Current Location' value={drop} onChange={(e) => SetDrop(e.target.value)} />

                </Form.Item>
                <Form.Item
                    name="notess"

                    rules={[
                        {
                            required: true,
                        },
                    ]}
                >
                    <Input placeholder='Drop Location' value={drop} onChange={(e) => SetDrop(e.target.value)} />
                </Form.Item>

                {console.log(drop)} */}

            {/* <Form.Item
        noStyle
        shouldUpdate={(prevValues, currentValues) => prevValues.gender !== currentValues.gender}
      >
        {({ getFieldValue }) =>
          getFieldValue('gender') === 'other' ? (
            <Form.Item
              name="customizeGender"
              label="Customize Gender"
              rules={[
                {
                  required: true,
                },
              ]}
            >
              <Input />
            </Form.Item>
          ) : null
        }
      </Form.Item> */}
            {/*  */}
            {/* <Form.Item {...tailLayout}>
                    <Link to="/driver">

                        <Button type="primary" htmlType="submit">
                            Submit
                        </Button>
                    </Link>

                </Form.Item>
            </Form> */}
            <div style={{ transform: "translate(60%,40%)" }}>
                <input placeholder='Current Location' required name='notess'></input>
                <br></br>
                <br></br>
                <input placeholder='Drop Location' required name='notess'></input>
            </div>
            <br></br>
            <div style={{ marginTop: "350px", marginRight: "190px", transform: "translate(-20%,-100%)" }}>
                <Link to="/fare">
                    <Button type="primary" htmlType="submit">
                        Submit
                    </Button>
                </Link>
            </div>
        </div>
    );
};
export default FormBook;