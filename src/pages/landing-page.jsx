import React from 'react';
import './landing-page.css';

const LandingPage = () => {
  return (
    <div>
      <div className='container'>
        <h3>Login </h3>
        <div className='row'>
          <div className='form-group'>
            <input
              type='text'
              className='form-control'
              aria-describedby='emailHelp'
              placeholder='User Name'
            />
          </div>
        </div>
      </div>
    </div>
  );
};

export default LandingPage;
