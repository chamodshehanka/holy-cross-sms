import React from 'react';
import { BrowserRouter as Router, Route } from 'react-router-dom';
import App from '../App';
import LandingPage from '../pages/landing-page';

const ROUTING = (
  <Router>
    <div>
      <Route exact path='/' component={LandingPage} />
      <Route path='/landing' component={App} />
    </div>
  </Router>
);

export default ROUTING;
