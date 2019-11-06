import React from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import App from '../App';
import LandingPage from '../pages/landing-page';

const ROUTING = (
  <Router>
    <div>
      <Route path='/' component={App} />
      <Route path='/landing' component={LandingPage} />
    </div>
  </Router>
);

export default ROUTING;
