import React, { Component } from 'react';
import { AppRegistry, TextInput, StyleSheet, Text, View } from 'react-native';

export default class BCetys extends Component {
  render() {
    let pic = {
      uri: 'https://www.google.com.mx/url?sa=i&rct=j&q=&esrc=s&source=images&cd=&ved=2ahUKEwimsJee2-jdAhUGL3wKHeYnCXcQjRx6BAgBEAU&url=https%3A%2F%2Fwww.timeshighereducation.com%2Fworld-university-rankings%2Fcetys-universidad&psig=AOvVaw2FXsZT0J2DOT3pPxQvyKFP&ust=1538602516687466'
    };
    return (
      <Image source={pic} style={{width: 193, height: 110}}/>
    );
  }
}
AppRegistry.registerComponent('AwesomeProject', () => Cetys);

export default class App extends Component {
  render() {
    return (
      <View style={styles.container}>
        <Text style={{fontWeight:'bold', fontSize:18}}>Itzel Shamira Macias Castro</Text>
        <Text>IDGD</Text>
        <Text>7mo Semestre</Text>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    backgroundColor: '#ffff',
    alignItems: 'center',
    justifyContent: 'center',
  },
});