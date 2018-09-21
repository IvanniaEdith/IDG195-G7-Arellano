import React from 'react';
import { StyleSheet, Text, View } from 'react-native';

export default class App extends React.Component {
  render() {
    return (
      <View style={styles.container}>
      <image style={styles.image} source={require('./src/img/portada.png')}/>
      <image style={styles.image} source={require('./src/img/profile.png')}/>
        <Text style={{fontWeight:'bold', fontSize:18}}>Itzel Shamira Macias Castro</Text>
        <Text style={style.Text}>IDGD</Text>
        <Text style={style.Text}>7mo Semestre</Text>
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
